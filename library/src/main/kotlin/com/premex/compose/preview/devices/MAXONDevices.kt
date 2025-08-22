package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXON device specifications for Android Compose previews.
 *
 * This extension provides MAXON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXON: Any
  get() = object {
      /** MAXON Acer_AC50 */
      val ACER_AC50 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** MAXON Senwa_S40 */
      val SENWA_S40 = "spec:width=480,height=800,unit=px,dpi=220"

  }
