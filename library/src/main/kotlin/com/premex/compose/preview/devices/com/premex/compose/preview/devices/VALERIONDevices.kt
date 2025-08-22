package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VALERION device specifications for Android Compose previews.
 *
 * This extension provides VALERION device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VALERION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VALERION: Any
  get() = object {
      /** DeviceSpec(manufacturer=VALERION, code=hengshan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VALERION, code=hengshan,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
