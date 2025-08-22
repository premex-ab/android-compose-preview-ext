package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PAX device specifications for Android Compose previews.
 *
 * This extension provides PAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=PAX, code=A50, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PAX, code=A50, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PAX, code=A77, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PAX, code=A77, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A77 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PAX, code=PAXM30, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PAX, code=PAXM30, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PAXM30 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
