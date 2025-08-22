package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Firehawk device specifications for Android Compose previews.
 *
 * This extension provides Firehawk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Firehawk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Firehawk: Any
  get() = object {
      /** Firehawk FP-600 */
      val FP_600 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Firehawk ToughDroid */
      val TOUGHDROID = "spec:width=800,height=1280,unit=px,dpi=240"

  }
