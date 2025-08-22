package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KIOWA device specifications for Android Compose previews.
 *
 * This extension provides KIOWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kiowa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kiowa: Any
  get() = object {
      /** KIOWA A5_CRISTAL */
      val A5_CRISTAL = "spec:width=640,height=1280,unit=px,dpi=320"

      /** KIOWA lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KIOWA mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KIOWA S5_CRISTAL */
      val S5_CRISTAL = "spec:width=480,height=854,unit=px,dpi=240"

      /** KIOWA X4_CRISTAL */
      val X4_CRISTAL = "spec:width=480,height=800,unit=px,dpi=240"

      /** KIOWA zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
