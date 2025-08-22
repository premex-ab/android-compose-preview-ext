package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mobvoi device specifications for Android Compose previews.
 *
 * This extension provides mobvoi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobvoi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobvoi: Any
  get() = object {
      /** DeviceSpec(manufacturer=mobvoi, code=catfish, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobvoi, code=catfish, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val CATFISH = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=mobvoi, code=catfish_ext, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobvoi, code=catfish_ext,
      width=400, height=400, dpi=280, isGoogleDevice=false).code */
      val CATFISH_EXT = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=mobvoi, code=catshark, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobvoi, code=catshark, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val CATSHARK = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=mobvoi, code=mooneye, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobvoi, code=mooneye, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val MOONEYE = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=mobvoi, code=rubyfish, width=454, height=454, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobvoi, code=rubyfish, width=454,
      height=454, dpi=320, isGoogleDevice=false).code */
      val RUBYFISH = "spec:width=454,height=454,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mobvoi, code=skipjack, width=360, height=360, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobvoi, code=skipjack, width=360,
      height=360, dpi=280, isGoogleDevice=false).code */
      val SKIPJACK = "spec:width=360,height=360,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=mobvoi, code=tunny, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobvoi, code=tunny, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val TUNNY = "spec:width=400,height=400,unit=px,dpi=280"

  }
