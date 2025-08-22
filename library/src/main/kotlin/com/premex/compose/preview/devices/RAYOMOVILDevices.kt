package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RAYO_MOVIL device specifications for Android Compose previews.
 *
 * This extension provides RAYO_MOVIL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RAYOMOVIL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RAYOMOVIL: Any
  get() = object {
      /** RAYO_MOVIL X1Plus */
      val X1PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

  }
