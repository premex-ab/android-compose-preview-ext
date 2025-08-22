package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEBULA device specifications for Android Compose previews.
 *
 * This extension provides NEBULA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEBULA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEBULA: Any
  get() = object {
      /** NEBULA CJU */
      val CJU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NEBULA D2140-Cosmos */
      val D2140_COSMOS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NEBULA DM8260 */
      val DM8260 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NEBULA DM8261 */
      val DM8261 = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
