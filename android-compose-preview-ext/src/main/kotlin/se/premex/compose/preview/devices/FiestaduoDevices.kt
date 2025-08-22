package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FiestaDuo device specifications for Android Compose previews.
 *
 * This extension provides FiestaDuo device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fiestaduo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fiestaduo: Any
  get() = object {
      /** FiestaDuo iX */
      val IX = "spec:width=720,height=1498,unit=px,dpi=320"

  }
