package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COMPARTIR device specifications for Android Compose previews.
 *
 * This extension provides COMPARTIR device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Compartir.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Compartir: Any
  get() = object {
      /** COMPARTIR M103H */
      val M103H = "spec:width=800,height=1280,unit=px,dpi=160"

  }
