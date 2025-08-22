package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TABWEE device specifications for Android Compose previews.
 *
 * This extension provides TABWEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tabwee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tabwee: Any
  get() = object {
      /** TABWEE T20 */
      val T20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TABWEE T90 */
      val T90 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** TABWEE W90 */
      val W90 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
