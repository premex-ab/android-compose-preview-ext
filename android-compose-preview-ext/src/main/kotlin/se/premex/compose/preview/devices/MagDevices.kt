package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MAG device specifications for Android Compose previews.
 *
 * This extension provides MAG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mag.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mag: Any
  get() = object {
      /** MAG lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MAG MAG425A */
      val MAG425A = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MAG MAG500A */
      val MAG500A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MAG YHT */
      val YHT = "spec:width=720,height=1280,unit=px,dpi=320"

  }
