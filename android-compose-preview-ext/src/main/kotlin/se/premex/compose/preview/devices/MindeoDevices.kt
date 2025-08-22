package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MINDEO device specifications for Android Compose previews.
 *
 * This extension provides MINDEO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mindeo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mindeo: Any
  get() = object {
      /** MINDEO MS8389 */
      val MS8389 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
