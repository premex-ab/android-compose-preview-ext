package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LANGO device specifications for Android Compose previews.
 *
 * This extension provides LANGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lango.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lango: Any
  get() = object {
      /** LANGO OPS-8195A */
      val OPS_8195A = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
