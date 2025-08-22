package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PERSONA device specifications for Android Compose previews.
 *
 * This extension provides PERSONA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Persona.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Persona: Any
  get() = object {
      /** PERSONA MyTab_A8 */
      val MYTAB_A8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
