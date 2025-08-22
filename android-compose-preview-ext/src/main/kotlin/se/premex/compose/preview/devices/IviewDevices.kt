package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * IVIEW device specifications for Android Compose previews.
 *
 * This extension provides IVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iview: Any
  get() = object {
      /** IVIEW IVIEW_1170TPC */
      val IVIEW_1170TPC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IVIEW 1016TPC */
      val _1016TPC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IVIEW 816TPC */
      val _816TPC = "spec:width=800,height=1280,unit=px,dpi=213"

  }
