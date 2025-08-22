package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Avvio device specifications for Android Compose previews.
 *
 * This extension provides Avvio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Avvio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Avvio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Avvio, code=Avvio_4GO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Avvio, code=Avvio_4GO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val AVVIO_4GO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Avvio, code=Avvio_A400, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Avvio, code=Avvio_A400, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val AVVIO_A400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Avvio, code=Avvio_Q503, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Avvio, code=Avvio_Q503, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AVVIO_Q503 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
