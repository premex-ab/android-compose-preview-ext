package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * acerpure device specifications for Android Compose previews.
 *
 * This extension provides acerpure device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Acerpure.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Acerpure: Any
  get() = object {
      /** acerpure anglelake */
      val ANGLELAKE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** acerpure waiawa */
      val WAIAWA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
