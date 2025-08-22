package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SKYLIFE device specifications for Android Compose previews.
 *
 * This extension provides SKYLIFE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Skylife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Skylife: Any
  get() = object {
      /** SKYLIFE DMTS17SS */
      val DMTS17SS = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SKYLIFE DMTS18SS */
      val DMTS18SS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKYLIFE INTEKS19SS */
      val INTEKS19SS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKYLIFE INTEKS22SS */
      val INTEKS22SS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SKYLIFE MA5000 */
      val MA5000 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
