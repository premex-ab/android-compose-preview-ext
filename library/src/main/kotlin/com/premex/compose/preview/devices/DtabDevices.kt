package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * dtab device specifications for Android Compose previews.
 *
 * This extension provides dtab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dtab: Any
  get() = object {
      /** dtab d-01G */
      val D_01G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** dtab d-01H */
      val D_01H = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** dtab d-01J */
      val D_01J = "spec:width=1600,height=2560,unit=px,dpi=400"

      /** dtab d-01K */
      val D_01K = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** dtab d-02H */
      val D_02H = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** dtab d-02K */
      val D_02K = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** dtab d-41A */
      val D_41A = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** dtab d-51C */
      val D_51C = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
