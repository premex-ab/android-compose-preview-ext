package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SOLONE device specifications for Android Compose previews.
 *
 * This extension provides SOLONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SOLONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SOLONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=SOLONE, code=E1457, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOLONE, code=E1457, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E1457 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SOLONE, code=W1450, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOLONE, code=W1450, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val W1450 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SOLONE, code=W1452, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOLONE, code=W1452, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val W1452 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
