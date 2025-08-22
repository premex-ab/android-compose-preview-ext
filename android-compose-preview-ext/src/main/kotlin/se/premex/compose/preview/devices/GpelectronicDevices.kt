package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * gpelectronic device specifications for Android Compose previews.
 *
 * This extension provides gpelectronic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gpelectronic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gpelectronic: Any
  get() = object {
      /** gpelectronic YC-3135D */
      val YC_3135D = "spec:width=480,height=800,unit=px,dpi=120"

  }
