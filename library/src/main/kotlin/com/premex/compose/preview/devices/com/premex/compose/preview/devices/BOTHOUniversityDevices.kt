package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BOTHO_University device specifications for Android Compose previews.
 *
 * This extension provides BOTHO_University device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BOTHOUniversity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BOTHOUniversity: Any
  get() = object {
      /** DeviceSpec(manufacturer=BOTHO_University, code=GLTAB101, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BOTHO_University, code=GLTAB101,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val GLTAB101 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
