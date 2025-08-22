package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ACTStreamTV4K device specifications for Android Compose previews.
 *
 * This extension provides ACTStreamTV4K device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Actstreamtv4k.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Actstreamtv4k: Any
  get() = object {
      /** ACTStreamTV4K HP40A */
      val HP40A = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
