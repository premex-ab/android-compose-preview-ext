package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SKYHCN device specifications for Android Compose previews.
 *
 * This extension provides SKYHCN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Skyhcn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Skyhcn: Any
  get() = object {
      /** SKYHCN K1100UA */
      val K1100UA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
