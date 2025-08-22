package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATOTO device specifications for Android Compose previews.
 *
 * This extension provides ATOTO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATOTO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATOTO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ATOTO, code=Multifunctional_Tablet, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATOTO,
      code=Multifunctional_Tablet, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MULTIFUNCTIONAL_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

  }
