package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Teracube device specifications for Android Compose previews.
 *
 * This extension provides Teracube device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teracube.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teracube: Any
  get() = object {
      /** DeviceSpec(manufacturer=Teracube, code=sapphire, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teracube, code=sapphire, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SAPPHIRE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teracube, code=Teracube_2e, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teracube, code=Teracube_2e,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val TERACUBE_2E = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Teracube, code=Teracube_One, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Teracube, code=Teracube_One,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val TERACUBE_ONE = "spec:width=1080,height=2280,unit=px,dpi=480"

  }
