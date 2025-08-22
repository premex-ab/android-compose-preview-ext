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
 * @Preview(device = Devices.Biorugged.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Biorugged: Any
  get() = object {
      /** BIORUGGED BIOWOLF8F30 */
      val BIOWOLF8F30 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** BIORUGGED BioWolf_C */
      val BIOWOLF_C = "spec:width=800,height=1280,unit=px,dpi=213"

  }
