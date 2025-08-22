package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BIORUGGED device specifications for Android Compose previews.
 *
 * This extension provides BIORUGGED device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BIORUGGED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BIORUGGED: Any
  get() = object {
      /** DeviceSpec(manufacturer=BIORUGGED, code=BIOWOLF8F30, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BIORUGGED, code=BIOWOLF8F30,
      width=800, height=1280, dpi=320, isGoogleDevice=false).code */
      val BIOWOLF8F30 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BIORUGGED, code=BioWolf_C, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BIORUGGED, code=BioWolf_C,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BIOWOLF_C = "spec:width=800,height=1280,unit=px,dpi=213"

  }
