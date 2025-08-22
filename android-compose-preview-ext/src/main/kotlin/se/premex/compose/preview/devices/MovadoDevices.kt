package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Movado device specifications for Android Compose previews.
 *
 * This extension provides Movado device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movado.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movado: Any
  get() = object {
      /** Movado tilefish */
      val TILEFISH = "spec:width=390,height=390,unit=px,dpi=320"

  }
