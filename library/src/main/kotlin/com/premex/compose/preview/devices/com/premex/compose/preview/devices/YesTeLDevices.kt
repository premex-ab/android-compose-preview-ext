package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YesTeL device specifications for Android Compose previews.
 *
 * This extension provides YesTeL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YesTeL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YesTeL: Any
  get() = object {
      /** DeviceSpec(manufacturer=YesTeL, code=Note_30_pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YesTeL, code=Note_30_pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val NOTE_30_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

  }
