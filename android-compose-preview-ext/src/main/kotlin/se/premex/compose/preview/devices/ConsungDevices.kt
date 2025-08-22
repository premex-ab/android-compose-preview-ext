package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CONSUNG device specifications for Android Compose previews.
 *
 * This extension provides CONSUNG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Consung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Consung: Any
  get() = object {
      /** CONSUNG CS10L_PRO */
      val CS10L_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

  }
