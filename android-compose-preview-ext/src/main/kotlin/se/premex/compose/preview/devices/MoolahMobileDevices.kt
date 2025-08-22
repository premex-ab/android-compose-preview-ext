package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Moolah_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Moolah_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MoolahMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MoolahMobile: Any
  get() = object {
      /** Moolah_Mobile T10 */
      val T10 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** Moolah_Mobile T100 */
      val T100 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Moolah_Mobile T10_Pro */
      val T10_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

  }
