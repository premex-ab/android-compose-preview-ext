package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * generalmobile device specifications for Android Compose previews.
 *
 * This extension provides generalmobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Generalmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Generalmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=generalmobile, code=GM6_d_sprout, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=generalmobile, code=GM6_d_sprout,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GM6_D_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=generalmobile, code=GM6_s_sprout, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=generalmobile, code=GM6_s_sprout,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val GM6_S_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

  }
