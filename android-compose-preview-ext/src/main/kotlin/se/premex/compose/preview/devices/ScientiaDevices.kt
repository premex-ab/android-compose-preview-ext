package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SCIENTIA device specifications for Android Compose previews.
 *
 * This extension provides SCIENTIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Scientia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Scientia: Any
  get() = object {
      /** SCIENTIA BBT1019863 */
      val BBT1019863 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SCIENTIA eWs10164T */
      val EWS10164T = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
