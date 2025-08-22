package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AXON device specifications for Android Compose previews.
 *
 * This extension provides AXON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Axon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Axon: Any
  get() = object {
      /** AXON Evolution */
      val EVOLUTION = "spec:width=800,height=1280,unit=px,dpi=213"

  }
