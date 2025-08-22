package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * eTera device specifications for Android Compose previews.
 *
 * This extension provides eTera device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Etera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Etera: Any
  get() = object {
      /** eTera E980U */
      val E980U = "spec:width=240,height=320,unit=px,dpi=120"

  }
