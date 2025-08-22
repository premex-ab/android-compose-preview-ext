package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * INCO device specifications for Android Compose previews.
 *
 * This extension provides INCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inco: Any
  get() = object {
      /** INCO Horizon */
      val HORIZON = "spec:width=480,height=996,unit=px,dpi=240"

  }
