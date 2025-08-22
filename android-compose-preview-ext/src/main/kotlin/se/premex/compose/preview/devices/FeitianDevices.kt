package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FEITIAN device specifications for Android Compose previews.
 *
 * This extension provides FEITIAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Feitian.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Feitian: Any
  get() = object {
      /** FEITIAN F100 */
      val F100 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
