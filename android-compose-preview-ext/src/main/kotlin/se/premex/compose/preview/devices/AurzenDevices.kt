package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AURZEN device specifications for Android Compose previews.
 *
 * This extension provides AURZEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aurzen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aurzen: Any
  get() = object {
      /** AURZEN TB-AS100A */
      val TB_AS100A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AURZEN TB-AS110A */
      val TB_AS110A = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** AURZEN yandangshan */
      val YANDANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
