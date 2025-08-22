package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mara device specifications for Android Compose previews.
 *
 * This extension provides Mara device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mara.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mara: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mara, code=Mara_Z_d_sprout, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mara, code=Mara_Z_d_sprout,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MARA_Z_D_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mara, code=Mara_Z_sprout, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mara, code=Mara_Z_sprout,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MARA_Z_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

  }
