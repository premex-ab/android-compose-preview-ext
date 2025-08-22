package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BUSH device specifications for Android Compose previews.
 *
 * This extension provides BUSH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bush.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bush: Any
  get() = object {
      /** BUSH Bush10Nou */
      val BUSH10NOU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** BUSH ewha */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BUSH sindang */
      val SINDANG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
