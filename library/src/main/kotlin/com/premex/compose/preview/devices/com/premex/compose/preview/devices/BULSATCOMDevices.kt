package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BULSATCOM device specifications for Android Compose previews.
 *
 * This extension provides BULSATCOM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BULSATCOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BULSATCOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=BULSATCOM, code=UPD-BJ00R, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BULSATCOM, code=UPD-BJ00R,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UPD_BJ00R = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
