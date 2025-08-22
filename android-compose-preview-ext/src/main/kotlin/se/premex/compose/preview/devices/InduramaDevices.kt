package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * INDURAMA device specifications for Android Compose previews.
 *
 * This extension provides INDURAMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Indurama.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Indurama: Any
  get() = object {
      /** INDURAMA elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** INDURAMA hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INDURAMA mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INDURAMA stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INDURAMA zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
