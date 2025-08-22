package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dynalink device specifications for Android Compose previews.
 *
 * This extension provides Dynalink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dynalink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dynalink: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dynalink, code=sti6130d350, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dynalink, code=sti6130d350,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6130D350 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dynalink, code=XNA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dynalink, code=XNA, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val XNA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dynalink, code=YOC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dynalink, code=YOC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YOC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
