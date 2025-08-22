package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EvocaTV device specifications for Android Compose previews.
 *
 * This extension provides EvocaTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evocatv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evocatv: Any
  get() = object {
      /** EvocaTV f511 */
      val F511 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
