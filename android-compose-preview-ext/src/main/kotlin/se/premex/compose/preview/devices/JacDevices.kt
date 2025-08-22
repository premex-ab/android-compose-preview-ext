package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * jAC device specifications for Android Compose previews.
 *
 * This extension provides jAC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jac: Any
  get() = object {
      /** jAC barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** jAC beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

  }
