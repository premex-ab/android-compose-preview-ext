package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATM device specifications for Android Compose previews.
 *
 * This extension provides ATM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATM: Any
  get() = object {
      /** DeviceSpec(manufacturer=ATM, code=R5, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATM, code=R5, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val R5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ATM, code=R5_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATM, code=R5_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val R5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ATM, code=X50u, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATM, code=X50u, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X50U = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
