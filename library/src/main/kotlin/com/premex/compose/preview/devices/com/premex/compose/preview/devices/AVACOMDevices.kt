package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AVACOM device specifications for Android Compose previews.
 *
 * This extension provides AVACOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AVACOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AVACOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=AVACOM, code=AVT015, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AVACOM, code=AVT015, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AVT015 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
