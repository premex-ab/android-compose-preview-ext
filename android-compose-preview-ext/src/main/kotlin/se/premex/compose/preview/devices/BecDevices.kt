package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BEC device specifications for Android Compose previews.
 *
 * This extension provides BEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bec: Any
  get() = object {
      /** BEC longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
