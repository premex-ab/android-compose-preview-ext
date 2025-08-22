package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bulsatcom device specifications for Android Compose previews.
 *
 * This extension provides Bulsatcom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bulsatcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bulsatcom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bulsatcom, code=IMTM741, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bulsatcom, code=IMTM741, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IMTM741 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
