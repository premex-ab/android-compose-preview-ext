package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * imiia device specifications for Android Compose previews.
 *
 * This extension provides imiia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imiia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imiia: Any
  get() = object {
      /** DeviceSpec(manufacturer=imiia, code=IAD, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=imiia, code=IAD, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IAD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=imiia, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=imiia, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=imiia, code=mateo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=imiia, code=mateo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=imiia, code=pioneer, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=imiia, code=pioneer, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=imiia, code=YUL, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=imiia, code=YUL, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
