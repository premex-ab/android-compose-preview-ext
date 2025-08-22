package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * INCLO device specifications for Android Compose previews.
 *
 * This extension provides INCLO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inclo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inclo: Any
  get() = object {
      /** INCLO khardi */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INCLO pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
