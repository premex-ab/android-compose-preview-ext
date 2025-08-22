package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * 2E device specifications for Android Compose previews.
 *
 * This extension provides 2E device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._2e.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._2e: Any
  get() = object {
      /** 2E capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** 2E E450A2018 */
      val E450A2018 = "spec:width=480,height=854,unit=px,dpi=240"

      /** 2E F534L */
      val F534L = "spec:width=480,height=960,unit=px,dpi=240"

      /** 2E F572L */
      val F572L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** 2E keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
