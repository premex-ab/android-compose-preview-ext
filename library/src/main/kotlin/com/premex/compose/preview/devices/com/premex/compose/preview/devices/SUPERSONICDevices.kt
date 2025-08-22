package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUPERSONIC device specifications for Android Compose previews.
 *
 * This extension provides SUPERSONIC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUPERSONIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUPERSONIC: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUPERSONIC, code=kanda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUPERSONIC, code=kanda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KANDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUPERSONIC, code=SC_2110A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUPERSONIC, code=SC_2110A,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SC_2110A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUPERSONIC, code=SC_4317, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUPERSONIC, code=SC_4317,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SC_4317 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
